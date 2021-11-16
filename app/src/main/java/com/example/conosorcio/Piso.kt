package com.example.conosorcio

import android.os.Parcel
import android.os.Parcelable

data class Piso( var numeroPiso: Int) : Parcelable { // Esta es una clase de tipo data class.
    constructor(parcel: Parcel) : this(parcel.readInt().toInt()) {  //es data class y tiene implementado los metodos
                                                                    //parcelables
                                                                    //contiene 1 propiedad que es numeroPiso de tipo int.
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(numeroPiso)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Piso> {
        override fun createFromParcel(parcel: Parcel): Piso {
            return Piso(parcel)
        }

        override fun newArray(size: Int): Array<Piso?> {
            return arrayOfNulls(size)
        }
    }
}