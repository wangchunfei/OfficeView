/*
 * 文件名称:          AbortReaderException.java
 *  
 * 编译器:            android2.2
 * 时间:              下午5:06:13
 */
package com.wangchunfei.reader.office.system;

public class AbortReaderError extends Error
{
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public AbortReaderError(String message)
    {
        super(message);
    }
}
