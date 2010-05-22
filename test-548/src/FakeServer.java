import org.apache.avro.ipc.HttpServer;
import org.apache.avro.specific.SpecificResponder;

public class FakeServer {
  public static class FakeImpl implements FakeProto {
    public Void fakeMethod() {
      return null;
    }
  }

  protected static void doMain(final String[] args) throws Exception {
    int port = 9090;
    System.out.println("starting Fake Avro server on port " + Integer.toString(port));
    SpecificResponder r = new SpecificResponder(FakeProto.class, new FakeImpl());
    HttpServer server = new HttpServer(r, 9090);
    Thread.sleep(1000000);
  }

  // TODO(hammer): Figure out why we do doMain()
  // TODO(hammer): Figure out if we want String[] or String []
  public static void main(String[] args) throws Exception {
    doMain(args);
  }
}