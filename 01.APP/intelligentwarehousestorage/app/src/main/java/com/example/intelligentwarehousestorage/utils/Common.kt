package com.example.intelligentwarehousestorage.utils


import com.itfitness.mqttlibrary.MQTTHelper

object Common {
    var Sever =
        "tcp://iot-06z00axdhgfk24n.mqtt.iothub.aliyuncs.com:1883" //mqtt连接ip oneNET为183.230.40.39

    var PORT = "6002"//oneNET为6002
    var ReceiveTopic = "/broadcast/h9sjEZ0rwqf/test2"
    var PushTopic = "/broadcast/h9sjEZ0rwqf/test1"
    var DriveID = "h9sjEZ0rwqf.smartapp|securemode=2,signmethod=hmacsha256,timestamp=1725414861178|"  //mqtt连接id  oneNET为设备id
    var DriveName = "smartapp&h9sjEZ0rwqf"  //设置用户名。跟Client ID不同。用户名可以看做权限等级"  oneNET为产品ID
    var DrivePassword = "459852f9cfb265e19f195a367cc52478c46669e4e947a96e29b14af1652d7b48"// //设置登录密码  oneNET为设备鉴权或apikey
    var Drive2ID = "**"
    var api_key = "***=wcjTY="
    var DeviceOnline = false //底层是否在线
    var LatestOnlineDate = "离线" //最近在线时间
    var mqttHelper: MQTTHelper? = null
}


