package au.com.iag.cmtsdk

import android.content.Context
import com.cmtelematics.sdk.AppModel
import com.cmtelematics.sdk.types.ModelConfiguration
import com.cmtelematics.sdk.types.ServiceConfiguration

class CmtAppModel(
    ctx: Context,
    modelConfiguration: ModelConfiguration,
    serviceConfiguration: ServiceConfiguration
) : AppModel(ctx, modelConfiguration, serviceConfiguration)
