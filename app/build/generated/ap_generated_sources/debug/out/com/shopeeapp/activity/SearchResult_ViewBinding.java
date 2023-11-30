// Generated code from Butter Knife. Do not modify!
package com.shopeeapp.activity;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.shopeeapp.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class SearchResult_ViewBinding implements Unbinder {
  private SearchResult target;

  @UiThread
  public SearchResult_ViewBinding(SearchResult target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public SearchResult_ViewBinding(SearchResult target, View source) {
    this.target = target;

    target.tvSearch = Utils.findRequiredViewAsType(source, R.id.tvSearch, "field 'tvSearch'", TextView.class);
    target.chipGroupProductType = Utils.findRequiredViewAsType(source, R.id.chipGroupProductType, "field 'chipGroupProductType'", ChipGroup.class);
    target.chipClothes = Utils.findRequiredViewAsType(source, R.id.chipClothes, "field 'chipClothes'", Chip.class);
    target.chipDrinks = Utils.findRequiredViewAsType(source, R.id.chipDrink, "field 'chipDrinks'", Chip.class);
    target.chipFood = Utils.findRequiredViewAsType(source, R.id.chipFood, "field 'chipFood'", Chip.class);
    target.chipElectronic = Utils.findRequiredViewAsType(source, R.id.chipElectronic, "field 'chipElectronic'", Chip.class);
    target.chipFreshFood = Utils.findRequiredViewAsType(source, R.id.chipFreshFood, "field 'chipFreshFood'", Chip.class);
    target.chipFruit = Utils.findRequiredViewAsType(source, R.id.chipFruit, "field 'chipFruit'", Chip.class);
    target.chipOthers = Utils.findRequiredViewAsType(source, R.id.chipOthers, "field 'chipOthers'", Chip.class);
    target.chipAllTypes = Utils.findRequiredViewAsType(source, R.id.chipAllProductTypes, "field 'chipAllTypes'", Chip.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    SearchResult target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tvSearch = null;
    target.chipGroupProductType = null;
    target.chipClothes = null;
    target.chipDrinks = null;
    target.chipFood = null;
    target.chipElectronic = null;
    target.chipFreshFood = null;
    target.chipFruit = null;
    target.chipOthers = null;
    target.chipAllTypes = null;
  }
}
