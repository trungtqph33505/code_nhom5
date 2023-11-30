// Generated code from Butter Knife. Do not modify!
package com.shopeeapp.fragment;

import android.view.View;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.appcompat.widget.SearchView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.shopeeapp.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class DiscountFragment_ViewBinding implements Unbinder {
  private DiscountFragment target;

  @UiThread
  public DiscountFragment_ViewBinding(DiscountFragment target, View source) {
    this.target = target;

    target.layoutSearchDiscount = Utils.findRequiredViewAsType(source, R.id.layoutSearchDiscount, "field 'layoutSearchDiscount'", LinearLayout.class);
    target.txtSearch = Utils.findRequiredViewAsType(source, R.id.txtSearchDiscount, "field 'txtSearch'", SearchView.class);
    target.gvSponsor = Utils.findRequiredViewAsType(source, R.id.gvSponsor, "field 'gvSponsor'", GridView.class);
    target.gvSearchResult = Utils.findRequiredViewAsType(source, R.id.gvSearchResult, "field 'gvSearchResult'", GridView.class);
    target.tvNumDiscount = Utils.findRequiredViewAsType(source, R.id.tvNumDiscount, "field 'tvNumDiscount'", TextView.class);
    target.layoutSponsor = Utils.findRequiredViewAsType(source, R.id.layoutSponsor, "field 'layoutSponsor'", LinearLayout.class);
    target.discountGroup = Utils.findRequiredViewAsType(source, R.id.discountGroup, "field 'discountGroup'", ChipGroup.class);
    target.discount10 = Utils.findRequiredViewAsType(source, R.id.discount10, "field 'discount10'", Chip.class);
    target.discount20 = Utils.findRequiredViewAsType(source, R.id.discount20, "field 'discount20'", Chip.class);
    target.discount30 = Utils.findRequiredViewAsType(source, R.id.discount30, "field 'discount30'", Chip.class);
    target.discountOther = Utils.findRequiredViewAsType(source, R.id.discountX, "field 'discountOther'", Chip.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    DiscountFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.layoutSearchDiscount = null;
    target.txtSearch = null;
    target.gvSponsor = null;
    target.gvSearchResult = null;
    target.tvNumDiscount = null;
    target.layoutSponsor = null;
    target.discountGroup = null;
    target.discount10 = null;
    target.discount20 = null;
    target.discount30 = null;
    target.discountOther = null;
  }
}
