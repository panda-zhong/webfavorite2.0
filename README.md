# webfavorite2.0
webfavorite2.0
需求分析:
鉴于日渐活跃的web端，人们往往通过百度来查找某个网站，但是很多很不错的网站总会被其他网站通过百度快照或者关键词算法等方式被冲刷掉。
今天，该产品将置身于用户，用户自己选择发布网站，并且由用户自己投票选择网站。
用户进入主页能够看到有热门排行，最新发布，分类大全，搜索等功能。
在热门排行中，排行由收藏40%，点击20%，浏览10%，点赞数30%，综合四者形成公式得到的结果来排序。
用户点进去之后，可以看到发布日期，作者，网站标签。 赞，踩的数量。
用户在分类大全中也可以看到最新的发布网站。
在搜索功能中，用户可以选择搜索用户，或者网站。
搜索网站结果也像在首页看到的样子，点击可以查看网站详情。
搜素用户可以看到用户的公开收藏夹，里面存放着用户对外公开的所有网站。当然用户也有排序，通过浏览量排序。
当然其他功能就是需要登录之后才能有。
我们先注册一个，注册需要账号，密码，邮箱，姓名，头像等信息。账号，邮箱，姓名不能与其他用户重复。
注册之后就能收藏网站，我们可以进入对应的刚才的网站，进行赞或者踩，也可以进行收藏。
我们也可以自行添加网站，通过输入网址，网站名称（异步获取），标签（异步获取），网站logo（异步获取），网站种类，网站介绍来添加网站，我们也可以选择是否发布在广场中。
如果选择发布在广场中，广场若存在该网址存在，就提醒用户广场已经存在，不能发布在广场。当然发布在广场也要经过管理员审核才行，当然管理员也可以帮忙修改网站描述等内容。


管理员：
管理用户，可以封掉用户的账号，防止有些用户水军。被封掉的用户无法能被找到，但是有黑名单的标签。那个用户所发布的网址也要在广场中下架。但是在用户本身那里还是存在的。
管理员可以查看需要审核进入广场的网站，如果不通过需要写明原因。
管理员也可以将对应的网站在广场中下架。

数据库：
书签：网址（id），头像，标题，类别，。
用户书签website: 用户账号，书签网址。用户自定义标题，类别，标签，收藏时间
标签：书签网址，标签内容。
广场书签：用户，发布时间，网址，踩，赞数，浏览次数，点击次数，状态（）。

用户User：账号（id），密码，邮箱，姓名，头像，注册时间，状态（是否封号 1为正常，0为封号）。
用户关注用户表：

管理员admin：基本信息与用户一致。

信息：发送者，接收者，发送时间。

用户：
注册：通过账号，密码注册，需要绑定邮箱，要有验证码，头像一开始默认。密码需要加密。姓名，账号不能重复
忘记密码：用户可通过邮箱验证码来修改密码。
添加收藏夹：输入网址，网站logo，（是否申请发布广场，是也需要检查是否广场有该网站）
关注用户。
修改基本信息。
查看我的收藏夹。

管理员admin： 
书签管理：用户提交申请，是否通过申请发布广场。下架书签。
用户管理：停用，恢复功能
标签管理：

主页：
搜索网址，用户，分页功能（搜索总数，分页总数，每页10个）。
通过种类获得广场信息，排序等（最后做）

消息管理：
管理员通过某个申请后，会发送消息给用户。
用户的网站收到点赞信息，增加粉丝，其他用户信息等。
管理员默认账号为admin。

统计功能：用户按月份统计收到的赞数，管理员按月份统计用户总数。


阿仲任务：
User
注册：所有信息插入
检查账号，姓名是否存在。
修改密码：邮箱，新密码
设置状态：账号，状态。
搜索：通过id搜索，姓名模糊搜索。

Userlikeuser
关注用户：（关注账号，用户账号）
取消关注：删除

信息message：
添加信息：（除了state所有信息）
修改信息状态为已读：id，改状态为1

Admin：
检查账号是否存在。
添加admin：所有信息。
设置状态

Userwebsite：
添加，修改，删除

Website：
添加（除了state所有信息）。
修改state
查询：关键词+排序方式+页面数。结果：结果总数，所有信息。

Websitelog：
添加
查询今天浏览最多的网站名称

Websitetab
添加
模糊查询
删除

