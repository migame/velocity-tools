package org.migame.velocity.tools;

import java.text.MessageFormat;
import java.util.Locale;

import org.apache.commons.lang3.StringUtils;

/**
 * @author Alex
 * @version 1.0.3
 *
 * Velocity tool which extends {@link StringUtils} wraps {@link String#format(String, Object...)},
 * {@link String#format(java.util.Locale, String, Object...)}, and provides methods to get instances of
 * {@link MessageFormat}. All methods are null-safe.
 */
public class StringTool
    extends StringUtils
{
    /**
     * @param format A format string
     * @param args Parameters to format using the given string
     * @return A string formatted using the given parameters, or null if format was null
     * @see String#format(String, Object...)
     */
    public String format(String format, Object... args)
    {
        return format == null ? null : String.format(format, args);
    }
    
    /**
     * @param locale The {@link Locale} to format for. If null, this parameter will be ignored.
     * @param format A format string
     * @param args Parameters to format using the given string
     * @return A string formatted using the given parameters, or null if format was null
     * @see String#format(java.util.Locale, String, Object...)
     */
    public String format(Locale locale, String format, Object... args)
    {
        return format == null ? null : locale == null ?
            String.format(format, args) : String.format(locale, format, args);
    }
    
    /**
     * @param format A {@link MessageFormat} pattern string
     * @return A {@link MessageFormat} instance, or null if format was null
     * @see MessageFormat#MessageFormat(String)
     */
    public MessageFormat getMessageFormat(String format)
    {
        return format == null ? null : new MessageFormat(format);
    }
    
    /**
     * @param locale The {@link Locale} to format for. If null, this parameter will be ignored.
     * @param format A {@link MessageFormat} pattern string
     * @return A {@link MessageFormat} instance, or null if format was null
     * @see MessageFormat#MessageFormat(String, java.util.Locale) 
     */
    public MessageFormat getMessageFormat(Locale locale, String format)
    {
        return format == null ? null : locale == null ? new MessageFormat(format) : new MessageFormat(format, locale);
    }
}
