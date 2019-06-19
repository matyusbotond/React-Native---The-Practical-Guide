package com.rnapp;

import com.oblador.vectoricons.VectorIconsPackage;
import com.reactnativenavigation.NavigationApplication;

import android.app.Application;

import com.facebook.react.ReactApplication;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;
import com.rnapp.generated.BasePackageList;

import org.unimodules.adapters.react.ReactAdapterPackage;
import org.unimodules.adapters.react.ModuleRegistryAdapter;
import org.unimodules.adapters.react.ReactModuleRegistryProvider;
import org.unimodules.core.interfaces.Package;
import org.unimodules.core.interfaces.SingletonModule;
import expo.modules.constants.ConstantsPackage;
import expo.modules.permissions.PermissionsPackage;
import expo.modules.filesystem.FileSystemPackage;

import java.util.Arrays;
import java.util.List;


// Application implements ReactApplication
public class MainApplication extends NavigationApplication{
  // private final ReactModuleRegistryProvider mModuleRegistryProvider = new ReactModuleRegistryProvider(
  //   new BasePackageList().getPackageList(),
  //   Arrays.<SingletonModule>asList()
  // );

  // private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
  //   @Override
  //   public boolean getUseDeveloperSupport() {
  //     return BuildConfig.DEBUG;
  //   }

  //   @Override
  //   protected List<ReactPackage> getPackages() {
  //     return Arrays.<ReactPackage>asList(
  //         new MainReactPackage(),
  //         new VectorIconsPackage(),
  //         new ModuleRegistryAdapter(mModuleRegistryProvider)
  //     );
  //   }

  //   @Override
  //   protected String getJSMainModuleName() {
  //     return "index";
  //   }
  // };

  // @Override
  // public ReactNativeHost getReactNativeHost() {
  //   return mReactNativeHost;
  // }

  // @Override
  // public void onCreate() {
  //   super.onCreate();
  //   SoLoader.init(this, /* native exopackage */ false);
  // }





	@Override
	public boolean isDebug() {
		// Make sure you are using BuildConfig from your own application
		return BuildConfig.DEBUG;
	}

	protected List<ReactPackage> getPackages() {
		// Add additional packages you require here
		// No need to add RnnPackage and MainReactPackage
		return Arrays.<ReactPackage>asList(
			// eg. new VectorIconsPackage()
      new VectorIconsPackage()
		);
	}

	@Override
	public List<ReactPackage> createAdditionalReactPackages() {
		return getPackages();
	}

  @Override
  public String getJSMainModuleName() {
	return "index";
}
}
