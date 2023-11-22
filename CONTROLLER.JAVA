
        TelephonyManager manager= (TelephonyManager) context.getSystemService(context.TELEPHONY_SERVICE);
        String devId=manager.getDeviceId();
        if (devId==null||devId.length()!=15)
            devId= Settings.Secure.getString(context.getContentResolver(),
                    Settings.Secure.ANDROID_ID);
        return devId.substring(devId.length()-5);



 if(number!=null && number.length()==11) {
            SmsManager sms = SmsManager.getDefault();
            sms.sendTextMessage(number, null, message, piSent, piDelivered);
        }


 InetAddress getBroadcastAddress() throws IOException {

            DhcpInfo dhcp = Controller.mWifiManager.getDhcpInfo();
            // handle null somehow

            int broadcast = (dhcp.ipAddress & dhcp.netmask) | ~dhcp.netmask;
            byte[] quads = new byte[4];
            for (int k = 0; k < 4; k++)
                quads[k] = (byte) ((broadcast >> k * 8) & 0xFF);
            return InetAddress.getByAddress(quads);
        }