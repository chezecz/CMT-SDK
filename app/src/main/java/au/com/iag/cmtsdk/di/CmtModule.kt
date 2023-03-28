package au.com.iag.cmtsdk.di

import android.content.Context
import au.com.iag.cmtsdk.CmtAppModel
import au.com.iag.cmtsdk.CmtServiceConfiguration
import com.cmtelematics.sdk.Sdk
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

object CmtModule {
    fun provideAppModel(@ApplicationContext ctx: Context): CmtAppModel {
        Sdk.init(ctx, CmtServiceConfiguration(ctx))
        return CmtAppModel(ctx)
    }
}
