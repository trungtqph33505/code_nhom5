// Generated code from Butter Knife. Do not modify!
package com.shopeeapp.activity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.shopeeapp.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class ProductDetail_ViewBinding implements Unbinder {
  private ProductDetail target;

  @UiThread
  public ProductDetail_ViewBinding(ProductDetail target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public ProductDetail_ViewBinding(ProductDetail target, View source) {
    this.target = target;

    target.productImage = Utils.findRequiredViewAsType(source, R.id.productImage, "field 'productImage'", ImageView.class);
    target.btnAddCart = Utils.findRequiredViewAsType(source, R.id.btnAddCart, "field 'btnAddCart'", Button.class);
    target.btnViewCart = Utils.findRequiredViewAsType(source, R.id.btnViewCart, "field 'btnViewCart'", Button.class);
    target.btnSubtract = Utils.findRequiredViewAsType(source, R.id.subtract, "field 'btnSubtract'", ImageButton.class);
    target.btnPlus = Utils.findRequiredViewAsType(source, R.id.plus, "field 'btnPlus'", ImageButton.class);
    target.txtQuantity = Utils.findRequiredViewAsType(source, R.id.txtQuantity, "field 'txtQuantity'", EditText.class);
    target.svReview = Utils.findRequiredViewAsType(source, R.id.svReview, "field 'svReview'", ScrollView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ProductDetail target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.productImage = null;
    target.btnAddCart = null;
    target.btnViewCart = null;
    target.btnSubtract = null;
    target.btnPlus = null;
    target.txtQuantity = null;
    target.svReview = null;
  }
}
