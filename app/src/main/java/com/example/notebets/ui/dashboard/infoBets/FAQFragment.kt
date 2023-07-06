package com.example.notebets.ui.dashboard.infoBets

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.main.Adapter
import com.example.notebets.R
import com.example.notebets.databinding.FragmentFAQBinding
import com.example.notebets.models.FaqModel
import com.example.notebets.utilits.APP_ACTIVITY

class FAQFragment : Fragment() {
lateinit var binding: FragmentFAQBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFAQBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



            binding.recyclerview.layoutManager = LinearLayoutManager(context)

            val data = listOf(
                FaqModel (
                    "Is it possible to make money by betting on sports?",
                    "Yes, it is possible for you to make money betting on sports. However, we must be clear that it is no walk in the park to become profitable while betting on sports. Even the best professional sports bettors still lose wagers regularly. What’s important is for you to develop your sports betting and bankroll strategy so that you give yourself the best chance to make money over the long haul of your sports betting career."
                ),
                FaqModel(
                    "How can I get started betting on sports?",
                    "If you’re brand new to betting on sports, it can be very tough to know exactly how you can get started. Luckily, we’re here to help you. We’ve developed a guide just for you that’s all about how you can get started with sports betting today. We’ll walk you through everything that you need to know and help you get things ramped up quickly. Click the link below to visit our beginner’s guide to sports betting page"
                ),
                FaqModel(
                    "How can I sharpen my sports betting skills?",
                    "No matter if you’re brand new to sports betting or a seasoned veteran, there’s always room for improvement when it comes to your sports betting skills. The answer to this question will depend on how advanced you are at this point. Since there isn’t a one-size-fits-all answer to this question, we’ve included a few links below to different pages that we’ve developed to help sports bettors like you improve their betting skills."
                ),
                FaqModel(
                    "How much money should I bet?",
                    "One of the most commonly asked questions by folks new to sports betting is how much money they should risk when placing a sports bet. In short, there is no blanket answer to this question. The amount of money that you should risk may vary from another person making the same bet based upon many different factors.\\n\\nThe most critical thing that you should do is establish a bankroll management plan. With this, you’ll devise a structured program that will help you determine how much you should wager at any given time. Without this, you’ll likely blow through your bankroll quickly and leave yourself without any betting funds. Click on the link below to view our page dedicated to bankroll management to see how you can establish a plan for yourself today."
                ),
                FaqModel(
                    "What’s the best sport to wager on?",
                    "There’s no single answer here that will apply to every individual reading this question. Often, the best sport to start betting on is the one that you know the most about. If you don’t understand how a sport works, it can be challenging to decide which bet you should place. As you look to expand the number of sports you bet on, you can increase your knowledge of other ones by watching them and doing research on the internet. You can use the link below to view our guide on choosing which sports to bet on to learn more about how you can see which ones may be right for you."
                ),
                FaqModel(
                    "How do I choose my selections?",
                    "Unfortunately, there isn’t a simple answer to this question. If it were that easy, sportsbooks would be out of business. One of our best tips for you is to bet on the sports that you know the most about and choose what you think the most likely outcome is. If you’d like to go deeper into how you can make your selections in the best method, then you don’t want to miss the information provided on the page linked below. Here, we’ll walk you through different things that you can utilize when you’re deciding on which selection you should make"
                ),
                FaqModel(
                    "What types of bets can I place?",
                    "With sports betting, there are tons of different types of bets that you can place. In fact, it’s too many for us to cover them all here. However, we have developed a page that’s packed with information on all of the different types of sports bets out there. To view this page, use the link below, and you’ll be on your way to learning more about all of your bet type options."
                ),
                FaqModel(
                    "How do I discern betting odds?",
                    "If you’re newer to sports betting, then you’re probably very confused about how to discern what the odds of a particular bet mean to you. We’ve been there before, and we know that it can be quite confusing. Because of that, we’ve developed a guide explaining all of the different types of sports betting odds. Using this guide, you’ll learn everything you need to know about how to interpret the odds of any bet that you are considering."
                ),
                FaqModel(
                    "Should I ever pay for sports betting tips?",
                    "Many folks are attracted to the idea of paying for sports betting tips for one of two reasons. First, they may be looking to get a leg up using information from an expert source that knows more than they do. Secondly, people often turn to tip services to help them since they don’t have a ton of time to do sports betting-related research due to a hectic life schedule between work and family.\\n\\nIn most cases, you probably should not pay for tips. The reason for this is because there are many scammers out there giving out sports betting “tips” without offering any worthwhile advice. In many cases, some of these services are providing tips and insight that’s publically available for free if you did a small amount of research on your own. While these services claim that they have experts on staff, that’s unfortunately not the case too often.\\n\\nHowever, there are some excellent tip services out there. The hard part is identifying which ones those are to make sure that you’re not getting scammed. Also, make sure to factor in what you’d be paying to the tip service as part of your bankroll. If you pay for tips, you’ll have less money to wager on your sports bets. Ultimately, the call is yours if you decide to pay for tips or not. Just be sure that you go into it cautiously and do homework before paying anyone for sports betting tips."
                ),
                FaqModel(
                    "Do I need to be a sports expert to bet on sports?",
                    "No. Anyone can bet on sports regardless of their sports knowledge. However, the more understanding that you have relating to the sports you’re betting on, the easier it will be for you to discern what bets might be best for you to make at any given point. Don’t let your lack of sports betting knowledge deter you from trying out sports betting."
                ),
                FaqModel(
                    "What is fantasy sports betting?",
                    "Things are very different between traditional sports betting and fantasy sports betting. With fantasy sports betting, you’ll be picking a fantasy team of players for a particular sport. Instead of betting on the outcome of sporting events and dealing with odds, you’re instead choosing and playing for an entire season of the sport.\\n\\nFantasy sports is another favorite way for people to bet on sports. Often, you’ll pay some form of an entry fee to enter your team into the competition. As the season progresses, you’ll earn points if your fantasy team of players performs well. If you end up having one of the best teams in your fantasy league, you can potentially win cash and prizes depending on the structure of your league."
                ),
                FaqModel(
                    "What does vigorish mean?",
                    "Also known as vig or juice, vigorish is essentially the commission that bookmakers charge on any wager you place. What’s nice is that the vig is factored into your bet so that you’re not paying an additional fee. It’s this commission that bookmakers use to help make profits. To learn more about vigorish and how sportsbooks earn a profit, be sure to check out the link below."
                )
            )
//
//        // This loop will create 20 Views containing
//        // the image with the count of view
//
//        // This will pass the ArrayList to our Adapter
            val adapter = Adapter()
            binding.recyclerview.adapter = adapter
            adapter.submitList(data)

            binding.btnBack4.setOnClickListener {
                APP_ACTIVITY.navController.navigate(R.id.action_FAQFragment_to_navigation_dashboard)
            }
        }
    }
