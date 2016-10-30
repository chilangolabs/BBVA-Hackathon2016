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
                .page(TitlePage(R.mipmap.ic_launcher, "Solari te ayuda a conectar con fondeadores para..."))
                .page(TitlePage(R.mipmap.img_example, "Solari te ayuda a conectar con fondeadores para..."))
                .page(TitlePage(R.drawable.account, "Solari te ayuda a conectar con fondeadores para..."))
                .page(TitlePage(R.drawable.domain, "Solari te ayuda a conectar con fondeadores para..."))
                .swipeToDismiss(true)
                .exitAnimation(android.R.anim.fade_out)
                .build()
    }

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_welcome)
//    }
}
