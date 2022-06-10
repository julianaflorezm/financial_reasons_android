package com.example.financialreasons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import com.example.financialreasons.operatingProfitMargin.OperatingProfitMarginFragment
import com.example.financialreasons.currentReason.CurrentReasonFragment
import com.example.financialreasons.debtLevel.DebtLevelFragment
import com.example.financialreasons.equityProfitability.EquityProfitabilityFragment
import com.example.financialreasons.financialAppeasement.FinancialAppeasementFragment
import com.example.financialreasons.finishedProductTurnover.FinishedProductTurnoverFragment
import com.example.financialreasons.grossProfitMargin.GrossProfitMarginFragment
import com.example.financialreasons.inventoryRotation.InventoryRotationFragment
import com.example.financialreasons.investmentTurnover.InvestmentTurnoverFragment
import com.example.financialreasons.netProfitMargin.NetProfitMarginFragment
import com.example.financialreasons.prodRotationProcess.ProdRotationProcessFragment
import com.example.financialreasons.returnInvestment.ReturnInvestmentFragment
import com.example.financialreasons.shortTermDebtConcentration.ShortTermDebtConcentrationFragment
import com.example.financialreasons.shortTermLeverage.ShortTermLeverageFragment
import com.example.financialreasons.timesWalletRotates.TimesWalletRotatesFragment
import com.example.financialreasons.totalLeverage.TotalLeverageFragment
import com.example.financialreasons.workingCapital.WorkingCapitalFragment
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private lateinit var toogle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toogle = ActionBarDrawerToggle(this, drawer_layout, R.string.navigation_drawer_open, R.string.navigation_drawer_close )
        drawer_layout.addDrawerListener(toogle)
        toogle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        nav_view.setNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.nav_current_reason -> {
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.fragmentContainerView,
                            CurrentReasonFragment()
                        )
                       commit()
                    }
                    drawer_layout.closeDrawer(GravityCompat.START)
                    true
                }
                R.id.nav_operating_profit_margin -> {
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.fragmentContainerView,
                            OperatingProfitMarginFragment()
                        )
                        commit()
                    }
                    drawer_layout.closeDrawer(GravityCompat.START)
                    true
                }
                R.id.nav_prod_rotation_process -> {
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.fragmentContainerView,
                            ProdRotationProcessFragment()
                        )
                        commit()
                    }
                    drawer_layout.closeDrawer(GravityCompat.START)
                    true
                }
                R.id.nav_times_wallet_rotates -> {
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.fragmentContainerView,
                            TimesWalletRotatesFragment()
                        )
                        commit()
                    }
                    drawer_layout.closeDrawer(GravityCompat.START)
                    true
                }
                R.id.nav_finished_product_turnover -> {
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.fragmentContainerView,
                            FinishedProductTurnoverFragment()
                        )
                        commit()
                    }
                    drawer_layout.closeDrawer(GravityCompat.START)
                    true
                }
                R.id.nav_net_profit_margin -> {
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.fragmentContainerView,
                            NetProfitMarginFragment()
                        )
                        commit()
                    }
                    drawer_layout.closeDrawer(GravityCompat.START)
                    true
                }
                R.id.nav_debt_level -> {
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.fragmentContainerView,
                            DebtLevelFragment()
                        )
                        commit()
                    }
                    drawer_layout.closeDrawer(GravityCompat.START)
                    true
                }
                R.id.nav_equity_profitability -> {
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.fragmentContainerView,
                            EquityProfitabilityFragment()
                        )
                        commit()
                    }
                    drawer_layout.closeDrawer(GravityCompat.START)
                    true
                }
                R.id.nav_short_term_debt_concentration -> {
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.fragmentContainerView,
                            ShortTermDebtConcentrationFragment()
                        )
                        commit()
                    }
                    drawer_layout.closeDrawer(GravityCompat.START)
                    true
                }
                R.id.nav_inventory_rotation -> {
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.fragmentContainerView,
                            InventoryRotationFragment()
                        )
                        commit()
                    }
                    drawer_layout.closeDrawer(GravityCompat.START)
                    true
                }
                R.id.nav_total_leverage -> {
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.fragmentContainerView,
                            TotalLeverageFragment()
                        )
                        commit()
                    }
                    drawer_layout.closeDrawer(GravityCompat.START)
                    true
                }
                R.id.nav_return_investment -> {
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.fragmentContainerView,
                            ReturnInvestmentFragment()
                        )
                        commit()
                    }
                    drawer_layout.closeDrawer(GravityCompat.START)
                    true
                }
                R.id.nav_short_term_leverage -> {
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.fragmentContainerView,
                            ShortTermLeverageFragment()
                        )
                        commit()
                    }
                    drawer_layout.closeDrawer(GravityCompat.START)
                    true
                }
                R.id.nav_investment_turnover -> {
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.fragmentContainerView,
                            InvestmentTurnoverFragment()
                        )
                        commit()
                    }
                    drawer_layout.closeDrawer(GravityCompat.START)
                    true
                }
                R.id.nav_financial_appeasement -> {
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.fragmentContainerView,
                            FinancialAppeasementFragment()
                        )
                        commit()
                    }
                    drawer_layout.closeDrawer(GravityCompat.START)
                    true
                }
                R.id.nav_gross_profit_margin -> {
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.fragmentContainerView,
                            GrossProfitMarginFragment()
                        )
                        commit()
                    }
                    drawer_layout.closeDrawer(GravityCompat.START)
                    true
                }
                R.id.nav_working_capital -> {
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.fragmentContainerView,
                            WorkingCapitalFragment()
                        )
                        commit()
                    }
                    drawer_layout.closeDrawer(GravityCompat.START)
                    true
                }
                else -> {
                    drawer_layout.closeDrawer(GravityCompat.START)
                    true
                }
            }
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(toogle.onOptionsItemSelected(item)) {
            return true
        }
        return super.onOptionsItemSelected(item)
    }
}