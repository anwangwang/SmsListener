# SmsListener
广播接收者练习。短信监听器

1.修改android编译版本之后，同步修改v7包

```
compile 'com.android.support:appcompat-v7:21.+'
```

2.由于android6.0(API23)之后的权限机制发生了修改，所以此dome是基于android5.0(API21)

3.android4.0(14)之后，如果app第一次安装时没有软件图标，广播接收者是不生效的
