package com.ccfraser.muirwik.wrapper.card

import com.ccfraser.muirwik.wrapper.createStyled
import com.ccfraser.muirwik.wrapper.setStyledPropsAndRunHandler
import react.RBuilder
import react.RComponent
import react.RState
import styled.StyledHandler
import styled.StyledProps


@JsModule("@material-ui/core/CardActions")
private external val cardActionsModule: dynamic

@Suppress("UnsafeCastFromDynamic")
private val cardActionsComponent: RComponent<MCardActionsProps, RState> = cardActionsModule.default

interface MCardActionsProps : StyledProps {
    var disableActionSpacing: Boolean
}

fun RBuilder.mCardActions(disableActionSpacing: Boolean = false,
                          handler: StyledHandler<MCardActionsProps>?) = createStyled(cardActionsComponent) {
    attrs.disableActionSpacing = disableActionSpacing
    setStyledPropsAndRunHandler(null, handler)
}
