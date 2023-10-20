// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.generated;

/** Samples for VolumeGroups ListByNetAppAccount. */
public final class VolumeGroupsListByNetAppAccountSamples {
    /*
     * x-ms-original-file: specification/netapp/resource-manager/Microsoft.NetApp/stable/2023-05-01/examples/VolumeGroups_List_Oracle.json
     */
    /**
     * Sample code: VolumeGroups_List_Oracle.
     *
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void volumeGroupsListOracle(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        manager.volumeGroups().listByNetAppAccount("myRG", "account1", com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/netapp/resource-manager/Microsoft.NetApp/stable/2023-05-01/examples/VolumeGroups_List_SapHana.json
     */
    /**
     * Sample code: VolumeGroups_List_SapHana.
     *
     * @param manager Entry point to NetAppFilesManager.
     */
    public static void volumeGroupsListSapHana(com.azure.resourcemanager.netapp.NetAppFilesManager manager) {
        manager.volumeGroups().listByNetAppAccount("myRG", "account1", com.azure.core.util.Context.NONE);
    }
}
