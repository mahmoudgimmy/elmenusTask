package com.example.elmenustask.databinding;
import com.example.elmenustask.R;
import com.example.elmenustask.BR;
import com.example.elmenustask.utilities.BindingAdaptersKt;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemTagBindingImpl extends ItemTagBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view, 3);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemTagBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemTagBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.view.View) bindings[3]
            );
        this.clTag.setTag(null);
        this.ivTagImage.setTag(null);
        this.tvTagName.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.tag == variableId) {
            setTag((com.example.elmenustask.models.Tag) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTag(@Nullable com.example.elmenustask.models.Tag Tag) {
        this.mTag = Tag;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.tag);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String tagPhotoURL = null;
        com.example.elmenustask.models.Tag tag = mTag;
        java.lang.String tagTagName = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (tag != null) {
                    // read tag.photoURL
                    tagPhotoURL = tag.getPhotoURL();
                    // read tag.tagName
                    tagTagName = tag.getTagName();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            BindingAdaptersKt.loadImage(this.ivTagImage, tagPhotoURL);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTagName, tagTagName);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): tag
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}