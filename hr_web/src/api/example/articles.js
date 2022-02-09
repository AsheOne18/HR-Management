import {createAPI, createFormAPI} from '@/utils/request'

export const list = data => createAPI('/articles/list', 'get', data)
export const types = [
  'Type1',
  'Type2',
  'Type3',
  'Type4',
  'Type5',
  'Type6',
  'Type7',
  'Type8',
  'Type9',
  'Type10',
  'Type11',
  'Type12',
  'Type13',
  'Type14',
  'Type15',
  'Type16'
]
