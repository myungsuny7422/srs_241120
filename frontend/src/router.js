
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import Manager from "./components/listers/Cards"
import Detail from "./components/listers/Detail"

import HrHrManager from "./components/listers/HrHrCards"
import HrHrDetail from "./components/listers/HrHrDetail"

import Manager from "./components/listers/Cards"
import Detail from "./components/listers/Detail"



export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '//',
                name: 'Manager',
                component: Manager
            },
            {
                path: '///:id',
                name: 'Detail',
                component: Detail
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

            {
                path: '//',
                name: 'Manager',
                component: Manager
            },
            {
                path: '///:id',
                name: 'Detail',
                component: Detail
            },




    ]
})
