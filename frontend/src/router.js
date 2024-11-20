
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import ReserveReserveManager from "./components/listers/ReserveReserveCards"
import ReserveReserveDetail from "./components/listers/ReserveReserveDetail"

import SeatSeatManager from "./components/listers/SeatSeatCards"
import SeatSeatDetail from "./components/listers/SeatSeatDetail"

import HrHrManager from "./components/listers/HrHrCards"
import HrHrDetail from "./components/listers/HrHrDetail"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/reserves/reserves',
                name: 'ReserveReserveManager',
                component: ReserveReserveManager
            },
            {
                path: '/reserves/reserves/:id',
                name: 'ReserveReserveDetail',
                component: ReserveReserveDetail
            },

            {
                path: '/seats/seats',
                name: 'SeatSeatManager',
                component: SeatSeatManager
            },
            {
                path: '/seats/seats/:id',
                name: 'SeatSeatDetail',
                component: SeatSeatDetail
            },

            {
                path: '/hrs/hrs',
                name: 'HrHrManager',
                component: HrHrManager
            },
            {
                path: '/hrs/hrs/:id',
                name: 'HrHrDetail',
                component: HrHrDetail
            },




    ]
})
