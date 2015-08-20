/*
* Copyright (c) 2014 Qunar.com. All Rights Reserved.
*/
package com.lxz.test.netty;

import io.netty.channel.ChannelHandlerAppender;
import io.netty.channel.ChannelHandlerContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author: xiaole  Date: 15-8-3 Time: 上午11:02
 * @version: \$Id$
 */
public class EchoServerHandler extends ChannelHandlerAppender {
    private static final Logger logger = LoggerFactory.getLogger(EchoServerHandler.class);

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        super.exceptionCaught(ctx, cause);
        cause.printStackTrace();
        ctx.close();
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        logger.info("Receive client: [ {} ]", msg);
    }
}