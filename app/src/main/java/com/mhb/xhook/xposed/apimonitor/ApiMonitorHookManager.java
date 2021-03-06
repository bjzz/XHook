package com.mhb.xhook.xposed.apimonitor;


import com.mhb.xhook.AppConfig;
import com.mhb.xhook.xposed.apimonitor.unused.AccountManagerHook;
import com.mhb.xhook.xposed.apimonitor.unused.ActivityManagerHook;
import com.mhb.xhook.xposed.apimonitor.unused.ActivityThreadHook;
import com.mhb.xhook.xposed.apimonitor.unused.AlarmManagerHook;
import com.mhb.xhook.xposed.apimonitor.unused.AudioRecordHook;
import com.mhb.xhook.xposed.apimonitor.unused.CameraHook;
import com.mhb.xhook.xposed.apimonitor.unused.ConnectivityManagerHook;
import com.mhb.xhook.xposed.apimonitor.unused.ContentResolverHook;
import com.mhb.xhook.xposed.apimonitor.unused.ContextImplHook;
import com.mhb.xhook.xposed.apimonitor.unused.MediaRecorderHook;
import com.mhb.xhook.xposed.apimonitor.unused.NetWorkHook;
import com.mhb.xhook.xposed.apimonitor.unused.NotificationManagerHook;
import com.mhb.xhook.xposed.apimonitor.unused.PackageManagerHook;
import com.mhb.xhook.xposed.apimonitor.unused.ProcessBuilderHook;
import com.mhb.xhook.xposed.apimonitor.unused.RuntimeHook;
import com.mhb.xhook.xposed.apimonitor.unused.SmsManagerHook;
import com.mhb.xhook.xposed.apimonitor.unused.TelephonyManagerHook;

import org.apache.log4j.Logger;

public class ApiMonitorHookManager {

    protected final Logger log = Logger.getLogger(AppConfig.CONF_TAG);

    private static ApiMonitorHookManager hookmger;
    private SmsManagerHook smsManagerHook;
    private TelephonyManagerHook telephonyManagerHook;
    private MediaRecorderHook mediaRecorderHook;
    private AccountManagerHook accountManagerHook;
    private ActivityManagerHook activityManagerHook;
    private AlarmManagerHook alarmManagerHook;
    private ConnectivityManagerHook connectivityManagerHook;
    private ContentResolverHook contentResolverHook;
    private ContextImplHook contextImplHook;
    private PackageManagerHook packageManagerHook;
    private RuntimeHook runtimeHook;
    private ActivityThreadHook activityThreadHook;
    private AudioRecordHook audioRecordHook;
    private CameraHook cameraHook;
    private NetWorkHook networkHook;
    private NotificationManagerHook notificationManagerHook;
    private ProcessBuilderHook processBuilderHook;


    private ApiMonitorHookManager(){
        this.smsManagerHook = new SmsManagerHook();
        this.telephonyManagerHook = new TelephonyManagerHook();
        this.mediaRecorderHook = new MediaRecorderHook();
        this.accountManagerHook = new AccountManagerHook();
        this.activityManagerHook = new ActivityManagerHook();
        this.alarmManagerHook= new AlarmManagerHook();
        this.connectivityManagerHook = new ConnectivityManagerHook();
        this.contentResolverHook = new ContentResolverHook();
        this.contextImplHook = new ContextImplHook();
        this.packageManagerHook = new PackageManagerHook();
        this.runtimeHook = new RuntimeHook();
        this.activityThreadHook = new ActivityThreadHook();
        this.audioRecordHook = new AudioRecordHook();
        this.cameraHook = new CameraHook();
        this.networkHook = new NetWorkHook();
        this.notificationManagerHook = new NotificationManagerHook();
        this.processBuilderHook = new ProcessBuilderHook();
    }

    public static ApiMonitorHookManager getInstance(){
        if(hookmger == null)
            hookmger = new ApiMonitorHookManager();
        return hookmger;
    }

    public void startMonitor(){
//        (new ViewHook()).startHook();
//        CommandExecution.CommandResult res1 = CommandExecution.execCommand("ls", false);
//        LOG.debug("mhb-test-1" + res1.errorMsg + res1.successMsg);
//        String[] cmd = {"cd /sdcard", "ls"};
//        CommandExecution.CommandResult res2 = CommandExecution.execCommand(cmd, true);
//        LOG.debug("mhb-test-2" + res2.errorMsg + res2.successMsg);

//        this.smsManagerHook.startHook();
//        this.telephonyManagerHook.startHook();
//        this.mediaRecorderHook.startHook();
//        this.accountManagerHook.startHook();
//        this.activityManagerHook.startHook();
//        this.alarmManagerHook.startHook();
//        this.connectivityManagerHook.startHook();
//        this.contentResolverHook.startHook();
//        this.contextImplHook.startHook();
//        this.packageManagerHook.startHook();
//        this.runtimeHook.startHook();
//        this.activityThreadHook.startHook();
//        this.audioRecordHook.startHook();
//        this.cameraHook.startHook();
//        this.networkHook.startHook();
//        this.notificationManagerHook.startHook();
//        this.processBuilderHook.startHook();
    }

}
