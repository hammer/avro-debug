@SuppressWarnings("all")
public interface FakeProto {
  public static final org.apache.avro.Protocol PROTOCOL = org.apache.avro.Protocol.parse("{\"protocol\":\"FakeProto\",\"namespace\":null,\"types\":[],\"messages\":{\"fakeMethod\":{\"request\":[],\"response\":\"null\"}}}");
  java.lang.Void fakeMethod()
    throws org.apache.avro.ipc.AvroRemoteException;
}
