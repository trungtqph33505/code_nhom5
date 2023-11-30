// Generated code from Butter Knife. Do not modify!
package com.shopeeapp.activity;

import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.shopeeapp.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AccountSettings_ViewBinding implements Unbinder {
  private AccountSettings target;

  @UiThread
  public AccountSettings_ViewBinding(AccountSettings target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public AccountSettings_ViewBinding(AccountSettings target, View source) {
    this.target = target;

    target.menuLogin = Utils.findRequiredViewAsType(source, R.id.menuLogin, "field 'menuLogin'", LinearLayout.class);
    target.menuEmailVerified = Utils.findRequiredViewAsType(source, R.id.menuEmailVerified, "field 'menuEmailVerified'", LinearLayout.class);
    target.menuForgotPassword = Utils.findRequiredViewAsType(source, R.id.menuForgotPassword, "field 'menuForgotPassword'", LinearLayout.class);
    target.menuUpdateAccount = Utils.findRequiredViewAsType(source, R.id.menuUpdateAccount, "field 'menuUpdateAccount'", LinearLayout.class);
    target.menuLogout = Utils.findRequiredViewAsType(source, R.id.menuLogout, "field 'menuLogout'", LinearLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    AccountSettings target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.menuLogin = null;
    target.menuEmailVerified = null;
    target.menuForgotPassword = null;
    target.menuUpdateAccount = null;
    target.menuLogout = null;
  }
}
