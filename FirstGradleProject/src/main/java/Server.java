import com.sun.net.httpserver.HttpServer;
import org.glassfish.jersey.jdkhttp.JdkHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.core.UriBuilder;
import java.io.IOException;
import java.net.URI;

public class Server {

    static final URI BASE_URI = getBaseURI();

    public static void main(String[] args) throws IOException {
        System.out.println("Starting HTTP Server...");
        HttpServer httpServer = startServer();
    }

    private static HttpServer startServer() {
        ResourceConfig config = new ResourceConfig(MyResource.class);
        return JdkHttpServerFactory.createHttpServer(BASE_URI, config);
    }

    private static URI getBaseURI() {
        return UriBuilder.fromUri("http://localhost/").port(8080).build();
    }
}
