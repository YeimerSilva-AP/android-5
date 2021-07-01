package org.owntracks.android.ui.contacts

import androidx.lifecycle.MutableLiveData
import dagger.hilt.android.scopes.ActivityScoped
import org.owntracks.android.data.repos.ContactsRepo
import org.owntracks.android.model.FusedContact
import org.owntracks.android.ui.base.viewmodel.BaseViewModel
import javax.inject.Inject

@ActivityScoped
class ContactsViewModel @Inject constructor(private val contactsRepo: ContactsRepo) :
    BaseViewModel<ContactsMvvm.View>(), ContactsMvvm.ViewModel<ContactsMvvm.View> {

    override val contacts: MutableLiveData<MutableMap<String, FusedContact>>
        get() = contactsRepo.all
}