package me.inassar.autoadaptertutorial

import me.inassar.autoadapter_annotations.AdapterModel
import me.inassar.autoadapter_annotations.ViewHolderBinding

@AdapterModel(R.layout.adapter_person_item_view)
data class Person(
    @ViewHolderBinding(R.id.personNameTv) val name: String,
    @ViewHolderBinding(R.id.personAddressTv) val address: String
)