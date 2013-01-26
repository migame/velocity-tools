package org.migame.velocity.tools;

import java.text.MessageFormat;
import java.util.Locale;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author Alex
 * @version 1.0.3
 */
public class StringToolTest
{
    static private final String PRINTF_TEST_STRING = "";
    static private final String MSGFMT_TEST_STRING = "";
    
    private final StringTool tool;
    
    public StringToolTest()
    {
        this.tool = new StringTool();
    }
    
    public @Test void testFormat()
    {
        Assert.assertNull(tool.format(null));
        Assert.assertNull(tool.format((Locale) null, null));
        Assert.assertNotNull(tool.format(PRINTF_TEST_STRING));
        Assert.assertNotNull(tool.format((Locale) null, PRINTF_TEST_STRING));
    }
    
    public @Test void testGetMessageFormat()
    {
        MessageFormat messageFormat       = tool.getMessageFormat(MSGFMT_TEST_STRING);
        MessageFormat messageFormatLocale = tool.getMessageFormat(null, MSGFMT_TEST_STRING);
        
        Assert.assertNull(tool.getMessageFormat(null));
        Assert.assertNull(tool.getMessageFormat(null, null));
        Assert.assertNotNull(messageFormat);
        Assert.assertNotNull(messageFormatLocale);
    }
}
