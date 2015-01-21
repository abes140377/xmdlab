package org.xmdlab.cartride.common.metafacade

import org.xmdlab.cartride.common.metafacade.Metafacade

class MetafacadeBase<T> implements Metafacade<T> {

	var private T _modelResource

	override T getModelResource() {
		return _modelResource
	}
	
	override setModelResource(T modelResource) {
		_modelResource = modelResource
	}

}
