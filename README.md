# ForceOfflineDemo
Android--利用BroadcastReceiver实现APP强制下线Demo

类似于QQ异地登陆后，会强制下线，并要求重新登录的功能。
Demo采用主动触发的方式，发送强制下线的广播，具体业务场景可以是从服务器发来的数据进行判断，如果有异地登录则发送广播，并强制下线通知本机重新登录。
