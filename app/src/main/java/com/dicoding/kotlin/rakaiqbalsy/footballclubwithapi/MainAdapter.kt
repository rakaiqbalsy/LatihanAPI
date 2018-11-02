package com.dicoding.kotlin.rakaiqbalsy.footballclubwithapi

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.dicoding.kotlin.rakaiqbalsy.footballclubwithapi.R.id.club_name
import com.dicoding.kotlin.rakaiqbalsy.footballclubwithapi.R.id.team_badge
import com.squareup.picasso.Picasso
import org.jetbrains.anko.*

class MainAdapter (private val teams: List<Club>)
    : RecyclerView.Adapter<TeamViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeamViewHolder {
        return TeamViewHolder(TeamUI().createView(AnkoContext.create(parent.context, parent)))
    }

    override fun getItemCount(): Int = teams.size

    override fun onBindViewHolder(holder: TeamViewHolder, position: Int) {
        holder.bindItem(teams[position])
    }
}

class TeamUI : AnkoComponent<ViewGroup> {
    override fun createView(ui: AnkoContext<ViewGroup>): View {
       return with(ui) {
           linearLayout {
               lparams (width = matchParent, height = wrapContent)
               padding = dip(15)
               orientation = LinearLayout.HORIZONTAL

               imageView {
                   id = R.id.team_badge
               }. lparams {
                   height = dip(50)
                   width = dip(50)
               }

               textView {
                   id = R.id.club_name
                   textSize = 16f
               }.lparams {
                   margin = dip(15)
               }
           }
       }
    }
}
class TeamViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    private val teamBadge: ImageView = view.find(team_badge)
    private val clubName: TextView = view.find(club_name)

    fun bindItem(teams: Club) {
        Picasso.get().load(teams.teamBadge).into(teamBadge)
        clubName.text = teams.teamName
    }
}