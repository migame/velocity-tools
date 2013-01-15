package org.migame.velocity.tools;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.velocity.tools.config.DefaultKey;

/**
 * @author Alex
 * @version 0.0.1
 * 
 * TODO: Document HashTool (org.migame.velocity.tools)
 */

@DefaultKey("hash")
public class HashTool
{
    /**
     * 
     * @param data
     * @return
     */
    public String md5(String data)
    {
        return DigestUtils.md5Hex(data);
    }
    
    /**
     * 
     * @param data
     * @return
     */
    public String md2(String data)
    {
        return DigestUtils.md2Hex(data);
    }
    
    /**
     *
     * @param data
     * @return
     */
    public String sha1(String data)
    {
        return DigestUtils.sha1Hex(data);
    }
    
    /**
     *
     * @param data
     * @return
     */
    public String sha256(String data)
    {
        return DigestUtils.sha256Hex(data);
    }
    
    /**
     *
     * @param data
     * @return
     */
    public String sha384(String data)
    {
        return DigestUtils.sha384Hex(data);
    }
    
    /**
     *
     * @param data
     * @return
     */
    public String sha512(String data)
    {
        return DigestUtils.sha512Hex(data);
    }
}
