package example.java.thread.executor;

import example.java.thread.cooperation.HttpConnect;

import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.*;

public class NewExecutorDemo {

    private Deque<Weblink> queue = new ArrayDeque<>();
    private ExecutorService downloadExecutor = Executors.newFixedThreadPool(2);
    private ExecutorService indexerExecutor = Executors.newFixedThreadPool(2);

    public static void main(String[] args) {

        NewExecutorDemo newExecutorDemo = new NewExecutorDemo();
        newExecutorDemo.add(newExecutorDemo.createWeblink(2000, "Taming Tiger, Part 2", "http://www.javaworld.com/article/2072759/core-java/taming-tiger--part-2.html", "http://www.javaworld.com"));
        newExecutorDemo.add(newExecutorDemo.createWeblink(2001, "How do I import a pre-existing Java project into Eclipse and get up and running?", "http://stackoverflow.com/questions/142863/how-do-i-import-a-pre-existing-java-project-into-eclipse-and-get-up-and-running", "http://www.stackoverflow.com"));
        newExecutorDemo.add(newExecutorDemo.createWeblink(2002, "Interface vs Abstract Class", "http://mindprod.com/jgloss/interfacevsabstract.html", "http://mindprod.com"));
        newExecutorDemo.add(newExecutorDemo.createWeblink(2004, "Virtual Hosting and Tomcat", "http://tomcat.apache.org/tomcat-6.0-doc/virtual-hosting-howto.html", "http://tomcat.apache.org"));
        newExecutorDemo.go();

    }


    public void go() {
        List<Future<Weblink>> futureList = new ArrayList<Future<Weblink>>();
        while (queue.size() > 0) {
            NewExecutorDemo.Weblink weblink = queue.remove();
            futureList.add(downloadExecutor.submit(new NewExecutorDemo.Downloader<Weblink>(weblink)));
        }
        futureList.forEach(future -> {
            try {
                indexerExecutor.execute(new Indexer(future.get()));
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });

        downloadExecutor.shutdown();
        indexerExecutor.shutdown();
    }

    public void add(NewExecutorDemo.Weblink link) {
        queue.add(link);
    }

    public NewExecutorDemo.Weblink createWeblink(long id, String title, String url, String host) {
        NewExecutorDemo.Weblink weblink = new NewExecutorDemo.Weblink();
        weblink.setId(id);
        weblink.setTitle(title);
        weblink.setUrl(url);
        weblink.setHost(host);
        return weblink;
    }

    private static class Weblink {
        private long id;
        private String title;
        private String url;
        private String host;

        private volatile String htmlPage;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }

        public String getHtmlPage() {
            return htmlPage;
        }

        public void setHtmlPage(String htmlPage) {
            this.htmlPage = htmlPage;
        }
    }

    private static class Downloader<T> implements Callable<T> {

        private Weblink weblink;

        public Downloader(Weblink weblink) {

            this.weblink = weblink;
        }

        @Override
        public T call() {

            try {
                String htmlPage = HttpConnect.download(weblink.getUrl());
                weblink.setHtmlPage(htmlPage);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (URISyntaxException e) {
                e.printStackTrace();
            }
            return (T) weblink;
        }
    }

    private static class Indexer implements Runnable {


        private Weblink weblink;

        public Indexer(Weblink weblink) {
            this.weblink = weblink;
        }

        @Override
        public void run() {

//            while (true) {
                String htmlPage = weblink.getHtmlPage();
//                if (htmlPage != null) {
                    index(htmlPage);

//                    break;
//                } else {
//                    System.out.println(weblink.getId() + " not yet downloaded!");
//                }
//            }
        }

        private void index(String text) {
            if (text != null) {
                System.out.println("\nIndexed: " + weblink.getId() + "\n");
            }
        }
    }
}





