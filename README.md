velocity-tools
==============
A collection velocity tools created primarily for use with [XWiki][].

## Submodules
### velocity-hashtool
Wraps several methods of [`org.apache.commons.codec.digest.DigestUtils`][DigestUtils]. To use, add
`velocity-hashtool-x.x.x.jar` to XWiki's classpath, then modify xwiki.properties and add the following line:

`velocity.tools = hashtool = org.migame.velocity.tools.HashTool`

## Dependencies
*NOTE: All runtime dependencies are scoped as "provided" in pom.xml files*

* `velocity-tools:velocity-tools:1.4`
* `org.testng:testng:6.8` (for tests only)

### velocity-hashtool
* `commons-codec:commons-codec:1.7`

[DigestUtils]: https://commons.apache.org/codec/api-1.7/?org/apache/commons/codec/digest/DigestUtils.html
[XWiki]: http://xwiki.org
