package com.wangchunfei.office.data

/*
 * -----------------------------------------------------------------
 * Copyright (C) 2018-2028, by Victor, All rights reserved.
 * -----------------------------------------------------------------
 * File: DocGroupInfo
 * Author: Victor
 * Date: 2023/10/26 14:25
 * Description: 
 * -----------------------------------------------------------------
 */

data class OfficeGroupInfo(
    var typeName: String? = null,
    var docList: ArrayList<OfficeInfo>? = null
)