package org.migame.velocity.tools;

import org.apache.commons.codec.digest.DigestUtils;

/**
 * @author Alex
 * @version 1.0.0
 * 
 * Velocity tool which wraps several methods of {@link DigestUtils}. 
 */
public class HashTool
{
    /**
     * @param data The string to hash
     * @return The MD2 hash of the given string as a lowercase hex string
     */
    public String md2(String data)
    {
        return DigestUtils.md2Hex(data);
    }
    
    /**
     * @param data The string to hash
     * @return The MD5 hash of the given string as a lowercase hex string
     */
    public String md5(String data)
    {
        return DigestUtils.md5Hex(data);
    }
    
    /**
     * @param data The string to hash
     * @return The SHA1 hash of the given string as a lowercase hex string
     */
    public String sha1(String data)
    {
        return DigestUtils.sha1Hex(data);
    }
    
    /**
     * @param data The string to hash
     * @return The SHA256 hash of the given string as a lowercase hex string
     */
    public String sha256(String data)
    {
        return DigestUtils.sha256Hex(data);
    }
    
    /**
     * @param data The string to hash
     * @return The SHA384 hash of the given string as a lowercase hex string
     */
    public String sha384(String data)
    {
        return DigestUtils.sha384Hex(data);
    }
    
    /**
     * @param data The string to hash
     * @return The SHA512 hash of the given string as a lowercase hex string
     */
    public String sha512(String data)
    {
        return DigestUtils.sha512Hex(data);
    }
}
