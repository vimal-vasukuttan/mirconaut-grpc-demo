// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: address.proto

package model;

public final class AddressMessage {
  private AddressMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_model_Address_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_model_Address_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\raddress.proto\022\005model\"[\n\007Address\022\r\n\005hou" +
      "se\030\001 \001(\t\022\016\n\006street\030\002 \001(\t\022\014\n\004city\030\003 \001(\t\022\022" +
      "\n\npostalCode\030\004 \001(\t\022\017\n\007country\030\005 \001(\tB\031\n\005m" +
      "odelB\016AddressMessageP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_model_Address_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_model_Address_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_model_Address_descriptor,
        new java.lang.String[] { "House", "Street", "City", "PostalCode", "Country", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
