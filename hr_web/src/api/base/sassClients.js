import {createAPI, createFormAPI} from '@/utils/request'

export const list = data => createAPI('/company', 'get', data)
export const detail = date => createAPI('/company/${data.id}',"get",data)