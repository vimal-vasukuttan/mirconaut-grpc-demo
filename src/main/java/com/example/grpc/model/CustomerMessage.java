// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: customer.proto

package model;

public final class CustomerMessage {
  private CustomerMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_model_Customer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_model_Customer_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016customer.proto\022\005model\032\raddress.proto\"_" +
      "\n\010Customer\022\021\n\tfirstName\030\001 \001(\t\022\022\n\nsecondN" +
      "ame\030\002 \001(\t\022\013\n\003age\030\003 \001(\005\022\037\n\007address\030\005 \001(\0132" +
      "\016.model.Address2<\n\016CreateCustomer\022*\n\006Cre" +
      "ate\022\017.model.Customer\032\017.model.CustomerB\032\n" +
      "\005modelB\017CustomerMessageP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          model.AddressMessage.getDescriptor(),
        });
    internal_static_model_Customer_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_model_Customer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_model_Customer_descriptor,
        new java.lang.String[] { "FirstName", "SecondName", "Age", "Address", });
    model.AddressMessage.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
