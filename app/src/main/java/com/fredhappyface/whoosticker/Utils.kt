package com.fredhappyface.whoosticker

/**
 * Class to provide utils that are shared across whoosticker.
 */
object Utils {
	/**
	 * @param name the File's name. Takes in a string here instead of a File because in certain
	 * places we have to use DocumentFile instead-- String name can be found by calling
	 * .getName() on both, but they are different classes.
	 * @return returns "." inclusive file extension.
	 */
	fun getFileExtension(name: String): String {
		val lastIndexOf = name.lastIndexOf(".")
		return if (lastIndexOf == -1) {
			""
		} else name.substring(lastIndexOf)
	}

	/**
	 * Needs to create a new HashMap on every call because shallow copies will cause issues between
	 * different input areas that support different media types.
	 *
	 * @return HashMap of whoosticker-supported mimes. Keys are "." inclusive.
	 */
	fun getSupportedMimes(): MutableMap<String, String> {
		return mutableMapOf(
			".gif" to "image/gif",
			".png" to "image/png",
			".apng" to "image/png",
			".jpg" to "image/jpg",
			".webp" to "image/webp"
		)
	}
}