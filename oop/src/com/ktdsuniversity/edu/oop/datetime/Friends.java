package com.ktdsuniversity.edu.oop.datetime;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Friends {

	private List<Friend> friendList;

	public Friends() {
		this.friendList = new ArrayList<>();
	}

	public void addFriend(Friend friend) {
		this.friendList.add(friend);
	}

	public Friend get(int index) {
		if (index >= this.friendList.size() || index < 0) {
			return null;
		}
		return this.friendList.get(index);
	}

	/**
	 * 생일이 다가오거나, 생일이거나, 생일이 지난 친구 찾아 반환
	 * 
	 * @param days 범위
	 * @return
	 */
	public List<Friend> findFriendsBy(int days) {
		List<Friend> foundFriends = new ArrayList<>();

		LocalDate now = LocalDate.now();
		// 오늘 날짜에서 3일 이전의 날짜를 구한다.
//		LocalDate birthPast = now.plusDays(days * -1);
		LocalDate birthPast2 = now.plusDays(days * -2);
		// 오늘 날짜에서 3일 이후의 날짜를 구한다
//		LocalDate birthFuture = now.plusDays(days);
		LocalDate birthFuture2 = now.plusDays(days + 1);

		LocalDate nowBirth = null;

		for (int i = 0; i < this.friendList.size(); i++) {
			// 친구들의 생일날짜에서 연도만 현재로 바꾼다
			nowBirth = this.friendList.get(i).getBirthdate().withYear(2026);

//			 //친구들의 생일이 오늘의 3일 이전 날짜보다 이후이면서 오늘보다 이전이면 foundFriends에 추가
//			if(nowBirth.isAfter(birthPast) && nowBirth.isBefore(now)) {
//				foundFriends.add(this.friendList.get(i));
//			}
//			 //친구들의 생일이 3일 이전의 날짜와 같은 경우
//			else if(nowBirth.isEqual(birthPast)) {
//				foundFriends.add(this.friendList.get(i));
//			}
			
			// 친구들의 생일이 오늘의 3일 이전 날짜보다 이후이면서 오늘보다 이전이면 foundFriends에 추가
			if (nowBirth.isAfter(birthPast2) && nowBirth.isBefore(now)) {
				foundFriends.add(this.friendList.get(i));
			}
			// 친구들의 생일이 오늘의 3일 이후 날짜보다 이전이면서 오늘보다 이후이면 foundFriends에 추가
			else if (nowBirth.isBefore(birthFuture2) && nowBirth.isAfter(now)) {
				foundFriends.add(this.friendList.get(i));
			}
			// 친구들의 생일이 오늘과 같으면 foundFriends에 추가
			else if (nowBirth.isEqual(now)) {
				foundFriends.add(this.friendList.get(i));
			}
			
//			// 친구들의 생일이 오늘의 3일 이후 날짜보다 이전이면서 오늘보다 이후이면 foundFriends에 추가
//			else if(nowBirth.isBefore(birthFuture) && nowBirth.isAfter(now)) {
//				foundFriends.add(this.friendList.get(i));
//			}
//			// 친구들의 생일이 3일 이후의 날짜와 같은 경우
//			else if(nowBirth.isEqual(birthFuture)) {
//				foundFriends.add(this.friendList.get(i));
//			}

		}

		return foundFriends;
	}

	@Override
	public String toString() {
		return "Friends [friendList=" + friendList + "]";
	}

}