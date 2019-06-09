package br.com.adalbertofjr.app.model

import android.os.Parcel
import android.os.Parcelable

data class Categoria(
        val id: Int,
        val descricao: String,
        val urlImagem: String
) : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readInt(),
            parcel.readString(),
            parcel.readString())

    override fun toString(): String = descricao
    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(descricao)
        parcel.writeString(urlImagem)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Categoria> {
        override fun createFromParcel(parcel: Parcel): Categoria {
            return Categoria(parcel)
        }

        override fun newArray(size: Int): Array<Categoria?> {
            return arrayOfNulls(size)
        }
    }
}
