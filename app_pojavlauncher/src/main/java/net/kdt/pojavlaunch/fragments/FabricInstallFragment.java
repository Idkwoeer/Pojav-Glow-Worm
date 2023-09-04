package net.kdt.pojavlaunch.fragments;

import net.kdt.pojavlaunch.modloaders.FabriclikeUtils;
import net.kdt.pojavlaunch.modloaders.ModloaderListenerProxy;

public class FabricInstallFragment extends FabriclikeInstallFragment {

    public static final String TAG = "FabricInstallFragment";
    private static ModloaderListenerProxy sTaskProxy;

    public FabricInstallFragment() {
        super(FabriclikeUtils.FABRIC_UTILS);
    }

    @Override
    protected ModloaderListenerProxy getListenerProxy() {
        return sTaskProxy;
    }

    @Override
    protected void setListenerProxy(ModloaderListenerProxy listenerProxy) {
        sTaskProxy = listenerProxy;
    }
}
