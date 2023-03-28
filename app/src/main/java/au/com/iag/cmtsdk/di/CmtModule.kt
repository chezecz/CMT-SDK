package au.com.iag.cmtsdk.di

import android.content.Context
import au.com.iag.cmtsdk.CmtAppModel
import au.com.iag.cmtsdk.CmtServiceConfiguration
import au.com.iag.cmtsdk.R
import com.cmtelematics.sdk.Sdk
import com.cmtelematics.sdk.types.ModelConfiguration
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object CmtModule {
    @Provides
    fun provideAppModel(@ApplicationContext ctx: Context): CmtAppModel {
        Sdk.init(ctx, ctx.getString(R.string.app_name))
        val modelConfiguration = ModelConfiguration()
        val serviceConfiguration = CmtServiceConfiguration(ctx)
        return CmtAppModel(ctx, modelConfiguration, serviceConfiguration)
    }
}
