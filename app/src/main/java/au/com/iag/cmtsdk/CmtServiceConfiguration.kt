package au.com.iag.cmtsdk

import android.content.ComponentName
import android.content.Context
import com.cmtelematics.sdk.CmtService
import com.cmtelematics.sdk.ServiceNotificationReceiver
import com.cmtelematics.sdk.types.ServiceConfiguration

class CmtServiceConfiguration(private val ctx: Context) : ServiceConfiguration() {
    override fun getCmtApiKey(): String = BuildConfig.CMT_API_KEY

    override fun getEndpoint(): String = BuildConfig.CMT_ENDPOINT

    override fun isReleaseMode(): Boolean = false

    override fun getTripRecordingService(): ComponentName =
        ComponentName(ctx, CmtService::class.java)

    override fun getAnomalyReceiver(): ComponentName =
        ComponentName(ctx, ServiceNotificationReceiver::class.java)
}