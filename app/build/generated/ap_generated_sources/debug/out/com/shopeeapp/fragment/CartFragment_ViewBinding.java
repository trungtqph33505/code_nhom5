// Generated code from Butter Knife. Do not modify!
package com.shopeeapp.fragment;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.shopeeapp.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class CartFragment_ViewBinding implements Unbinder {
  private CartFragment target;

  @UiThread
  public CartFragment_ViewBinding(CartFragment target, View source) {
    this.target = target;

    target.noMoreCarts = Utils.findRequiredViewAsType(source, R.id.noMoreCarts, "field 'noMoreCarts'", LinearLayout.class);
    target.cartList = Utils.findRequiredViewAsType(source, R.id.cartList, "field 'cartList'", ScrollView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    CartFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.noMoreCarts = null;
    target.cartList = null;
  }
}
