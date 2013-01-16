package org.migame.velocity.tools;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Alex
 * @version 1.0.0
 * 
 * Tests the methods of {@link HashTool}.
 */
public class HashToolTest
{
    static private final String TEST_DATA = "test@test.com";
    private final HashTool tool;
    
    public HashToolTest()
    {
        this.tool = new HashTool();
    }
    
    public @Test void testMd2()
    {
        Assert.assertEquals(tool.md2(TEST_DATA), "991882b63f104d17d86db114096f73ae");
    }
    
    public @Test void testMd5()
    {
        Assert.assertEquals(tool.md5(TEST_DATA), "b642b4217b34b1e8d3bd915fc65c4452");
    }
    
    public @Test void testSha1()
    {
        Assert.assertEquals(tool.sha1(TEST_DATA), "a6ad00ac113a19d953efb91820d8788e2263b28a");
    }
    
    public @Test void testSha256()
    {
        Assert.assertEquals(tool.sha256(TEST_DATA), "f660ab912ec121d1b1e928a0bb4bc61b15f5ad44d5efdc4e1c92a25e99b8e44a");
    }
    
    public @Test void testSha384()
    {
        Assert.assertEquals(tool.sha384(TEST_DATA), "49a126cb1504ba78c7de144fc6574b6f0a7dc92992fb7d4a4dadf0fcd16b8c4ec9daf8cf5381c4eda328cd0f36c6d164");
    }
    
    public @Test void testSha512()
    {
        Assert.assertEquals(tool.sha512(TEST_DATA), "045b45ad1b02b7e0de222e19c77a4e765851378a1eb2202e346cde5f979a3217e83454921dfebe3e4e27bb5cc8de91ce68ed75682bd87c1e323146d94c7a2b31");
    }
}
