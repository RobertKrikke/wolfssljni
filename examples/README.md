
# wolfSSL JNI Examples

This directory contains examples for the wolfSSL thin JNI wrapper. To view
examples for the wolfSSL JSSE provider, look in the
[./examples/provider](./provider) directory.

Examples should be run from the package root directory, and using the provided
wrapper scripts. The wrapper scripts set up the correct environment variables
for use with the wolfjni jar included in the wolfssljni package.

## Notes on Debug and Logging

wolfJSSE debug logging can be enabled by using `-Dwolfjsse.debug=true` at
runtime.

wolfSSL native debug logging can be enabled by using `-Dwolfssl.debug=true` at
runtime, if native wolfSSL has been compiled with `--enable-debug`.

JDK debug logging can be enabled using the `-Djavax.net.debug=all` option.

## wolfSSL JNI Example Client and Server

Example client/server applications that use wolfSSL JNI:

**Server.java** - Example wolfSSL JNI server \
**Client.java** - Example wolfSSL JNI client

These examples can be run with the provided bash scripts:

```
$ cd <wolfssljni_root>
$ ./examples/server.sh <options>
$ ./examples/client.sh <options>
```

To view usage and available options for the examples, use the `-?`
argument:

```
$ ./examples/server.sh --help
```

## X509v3 Certificate Generation Example

An example is included which will generate self-signed and CA-signed
X.509v3 certificates using the wolfSSL JNI library `WolfSSLCertificate`
class.

**X509v3CertificateGeneration.java** - Certificate generation example

This example is compiled when the `ant examples` target is executed, and can
be run afterwards with the provided bash script:

```
$ cd <wolfssljni_root>
$ ./examples/X509v3CertificateGeneration.sh
```

This will write out generated certificates to the following directory:

```
examples/certs/generated/
```

## Support

Please contact the wolfSSL support team at support@wolfssl.com with any
questions or feedback.

