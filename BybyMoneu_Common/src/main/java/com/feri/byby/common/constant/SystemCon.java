package com.feri.byby.common.constant;

/**
 *@Author feri
 *@Date Created in 2018/11/28 09:28
 */
public class SystemCon {
    //返回码
    public static final int ROK=100000;
    public static final int RERROR1=100001;
    public static final int RERROR2=100002;
    public static final int RERROR3=100003;
    public static final int RERROR4=100004;

    //请求方式
    public static final String GET="GET";
    public static final String POST="POST";

    //需要用到秘钥  AES
    public static final String TOKENKEY="rIx0kOItRGXwfKJksWVhmg==";
    public static final String PASSKEY="xQyfQmWAlLQCT9Y5Gxh2IQ==";

    //token对应的redis的key
    public static final String TOKENHASH="usertokens";
    public static final String TOKECOOKIE="usertoken";
    public static final String TOKENPRE="token:";



}
