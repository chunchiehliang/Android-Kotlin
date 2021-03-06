package com.chunchiehliang.test;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.chunchiehliang.test.databinding.ActivityMainBindingImpl;
import com.chunchiehliang.test.databinding.ActivityNewPostBindingImpl;
import com.chunchiehliang.test.databinding.FragmentHomeBindingImpl;
import com.chunchiehliang.test.databinding.FragmentProfileBindingImpl;
import com.chunchiehliang.test.databinding.FragmentTestBindingImpl;
import com.chunchiehliang.test.databinding.ListItemPostBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_ACTIVITYNEWPOST = 2;

  private static final int LAYOUT_FRAGMENTHOME = 3;

  private static final int LAYOUT_FRAGMENTPROFILE = 4;

  private static final int LAYOUT_FRAGMENTTEST = 5;

  private static final int LAYOUT_LISTITEMPOST = 6;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(6);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.chunchiehliang.test.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.chunchiehliang.test.R.layout.activity_new_post, LAYOUT_ACTIVITYNEWPOST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.chunchiehliang.test.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.chunchiehliang.test.R.layout.fragment_profile, LAYOUT_FRAGMENTPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.chunchiehliang.test.R.layout.fragment_test, LAYOUT_FRAGMENTTEST);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.chunchiehliang.test.R.layout.list_item_post, LAYOUT_LISTITEMPOST);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYNEWPOST: {
          if ("layout/activity_new_post_0".equals(tag)) {
            return new ActivityNewPostBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_new_post is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPROFILE: {
          if ("layout/fragment_profile_0".equals(tag)) {
            return new FragmentProfileBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_profile is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTEST: {
          if ("layout/fragment_test_0".equals(tag)) {
            return new FragmentTestBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_test is invalid. Received: " + tag);
        }
        case  LAYOUT_LISTITEMPOST: {
          if ("layout/list_item_post_0".equals(tag)) {
            return new ListItemPostBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for list_item_post is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(5);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "post");
      sKeys.put(2, "viewModel");
      sKeys.put(3, "clickListener");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(6);

    static {
      sKeys.put("layout/activity_main_0", com.chunchiehliang.test.R.layout.activity_main);
      sKeys.put("layout/activity_new_post_0", com.chunchiehliang.test.R.layout.activity_new_post);
      sKeys.put("layout/fragment_home_0", com.chunchiehliang.test.R.layout.fragment_home);
      sKeys.put("layout/fragment_profile_0", com.chunchiehliang.test.R.layout.fragment_profile);
      sKeys.put("layout/fragment_test_0", com.chunchiehliang.test.R.layout.fragment_test);
      sKeys.put("layout/list_item_post_0", com.chunchiehliang.test.R.layout.list_item_post);
    }
  }
}
