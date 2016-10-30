package com.chilangolabs.capitallab

import com.stephentuso.welcome.TitlePage
import com.stephentuso.welcome.WelcomeActivity
import com.stephentuso.welcome.WelcomeConfiguration

class WelcomeActivity : WelcomeActivity() {
    override fun configuration(): WelcomeConfiguration {
//        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
        return WelcomeConfiguration.Builder(this)
                .defaultTitleTypefacePath("Montserrat-Bold.ttf")
                .defaultHeaderTypefacePath("Montserrat-Bold.ttf")
                .defaultBackgroundColor(R.color.colorPrimary)
//                .defaultBackgroundColor(R.drawable.bg_gradient_blue_vertical)
                .page(TitlePage(R.mipmap.landing_one, "Tendrás acceso a prestatarios y prestamistas (dependiendo el rol que elijas) para ofrecer o conseguir el financiamiento que buscas."))
                .page(TitlePage(R.mipmap.landing_two, "Crea tu solicitud de financiamiento o revisa las solicitudes que se adapten al perfil que quieres apoyar."))
                .page(TitlePage(R.mipmap.landing_three, "¡Listo! Elige el trato que más te convenga y echa a andar tus planes."))
                .swipeToDismiss(true)
                .exitAnimation(android.R.anim.fade_out)
                .build()
    }

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_welcome)
//    }
}
